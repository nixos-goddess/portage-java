package main.lib.portage.package_management.flags;

import main.lib.portage.interfaces.FlagFeature;
import main.lib.portage.package_management.EmergePackage;

public class Verbose implements FlagFeature {

	@Override
	public int flagId() {
		return 3;
	}

	@Override
	public boolean deployFlag(EmergePackage packag) {
		System.out.println("verbose mode");
		return true;
	}

}
