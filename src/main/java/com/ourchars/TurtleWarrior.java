package com.ourchars;

import com.app.Weapons.Weapon;
import com.interfaces.Warrior;
import com.parents.Turtle;

public class TurtleWarrior extends Turtle implements Warrior {

	public TurtleWarrior() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TurtleWarrior(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 75);
	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 0);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		// TODO Auto-generated method stub
		super.setWeapon(Weapon.MACE);
	}	
}
