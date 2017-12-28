package fr.darkprod.archymod;

public class References {
	public static final String MOD_ID = "archydium";
	public static final String MOD_NAME = "Archymod";
	public static final String VERSION = "4.0";
	public static final String CLIENT_PROXY = "fr.darkprod.archymod.proxy.ClientProxy";
	public static final String SERVER_PROXY = "fr.darkprod.archymod.proxy.ServerProxy";

	
	public static enum ArchydiumItems {
		ArchydiumINGOT("ArchydiumIngot", "IngotArchydium");
		
		
		private String unlocalizedName;
		private String registryName;
		
		ArchydiumItems(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		public String getRegistryName() {
			return registryName;
		}
	}
}

