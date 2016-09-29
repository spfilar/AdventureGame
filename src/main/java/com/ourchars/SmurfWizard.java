package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Wizard;
import com.parents.Smurf;

public class SmurfWizard extends Smurf implements Wizard {

	public SmurfWizard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmurfWizard(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 0);
	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 200);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.WAND);
	}	
}
