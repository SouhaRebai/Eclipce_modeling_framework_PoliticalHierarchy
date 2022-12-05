package countriesPack;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLResource.XMLMap;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import countries.City;
import countries.CountriesPackage;
import countries.Country;
import countries.County;
import countries.Mayor;
import countries.State;

public class countriesManipulation {
	public void sauverModele(String uri, EObject root) {
		 Resource resource = null;
		 try {
		 URI uriUri = URI.createURI(uri);
		 Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		 resource = (new ResourceSetImpl()).createResource(uriUri);
		 resource.getContents().add(root);
		 resource.save(null);
		 } 
		 catch (Exception e) {
		 System.err.println("ERREUR sauvegarde du modèle : "+e);
		 e.printStackTrace();
		 }
		}
		public Resource chargerModele(String uri, EPackage pack) {
		 Resource resource = null;
		 try {
		 URI uriUri = URI.createURI(uri);
		 Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		 resource = (new ResourceSetImpl()).createResource(uriUri);
		 XMLResource.XMLMap xmlMap = new XMLMapImpl();
		 xmlMap.setNoNamespacePackage(pack);
		 java.util.Map options = new java.util.HashMap();
		 options.put(XMLResource.OPTION_XML_MAP, xmlMap);
		 resource.load(options);
		 }
		 catch(Exception e) {
		 System.err.println("ERREUR chargement du modèle : "+e);
		 e.printStackTrace();
		 }
		 return resource;
		}
		
		
		public Country getCountry(String countryFile) {
			Resource resource = chargerModele(countryFile, CountriesPackage.eINSTANCE);
			if (resource == null) {
				System.err.println(" Erreur de chargement du modèle");
				return null;
			}

			TreeIterator<EObject> it = resource.getAllContents();

			Country base = null;
			while(it.hasNext()) {
				EObject obj = (EObject) it.next();
				if (obj instanceof Country) {
					base = (Country) obj;
					break;
				}
			}
			return base;
		}

		
		public void printModel(Country c) {
			System.out.println("**** Country name : "+c.getName());
			System.out.println("**** Country current president : "+c.getPresident());
			System.out.println("------ List of cities:");
			for(State s : c.getState()) {
				System.out.println();
				System.out.println("**** State name : "+s.getName());
				System.out.println("**** Current governor : "+s.getGovernor());
				System.out.println("**** State Population : "+s.getPopulation());
				System.out.println("**** State total area : "+s.getTotalArea());
				System.out.println("------ List of countries:");
				for(County co : s.getCounty()  ) {
					System.out.println("\t County Name "+ co.getName());
					System.out.println("\t Current commissioner is :"+ co.getCommissioner());
					System.out.println("\t the largest city is :"+ co.getLargestCity());
					for(City city : co.getCity()  ) {
						System.out.println("\t City name "+ city.getName());
						System.out.println("\t Current mayor is :"+ city.getMayor());
						System.out.println("\t Population :"+ city.getPopulation());
					}	
				}
			}
		}
		public static void main(String argv[]) {

			countriesManipulation manip = new countriesManipulation();

			System.out.println(" Chargement du mod�le\n");

			Country model = manip.getCountry("model/Country.xmi");
			
			manip.printModel(model);	
			System.out.println("\n Sauvegarde du mod�le");
			manip.sauverModele("model/Country.xmi", model);
		}
}
