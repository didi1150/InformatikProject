package me.didi.utilities;

public class BaseStats {

	private int baseHealth;
	private int baseDefense;
	private int baseMagicResist;
	private int baseArmorPenetration;
	private int baseMagicPenetration;
	private int baseAttackDamage;
	private int baseAbilityPower;

	public BaseStats(int baseHealth, int baseDefense, int baseMagicResist, int baseArmorPenetration,
			int baseMagicPenetration, int baseAttackDamage, int baseAbilityPower) {
		this.baseHealth = baseHealth;
		this.baseDefense = baseDefense;
		this.baseMagicResist = baseMagicResist;
		this.baseArmorPenetration = baseArmorPenetration;
		this.baseMagicPenetration = baseMagicPenetration;
		this.baseAttackDamage = baseAttackDamage;
		this.baseAbilityPower = baseAbilityPower;
	}

	public int getBaseHealth() {
		return baseHealth;
	}

	public int getBaseDefense() {
		return baseDefense;
	}

	public int getBaseMagicResist() {
		return baseMagicResist;
	}

	public int getBaseArmorPenetration() {
		return baseArmorPenetration;
	}

	public int getBaseMagicPenetration() {
		return baseMagicPenetration;
	}

	public int getBaseAttackDamage() {
		return baseAttackDamage;
	}

	public int getBaseAbilityPower() {
		return baseAbilityPower;
	}
	
}