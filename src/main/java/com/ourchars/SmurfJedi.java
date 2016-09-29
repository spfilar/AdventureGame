package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Jedi;
import com.parents.Smurf;

public class SmurfJedi extends Smurf implements Jedi {

	public SmurfJedi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmurfJedi(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 50);
	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 100);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.LIGHTSABER);
	}	
}
