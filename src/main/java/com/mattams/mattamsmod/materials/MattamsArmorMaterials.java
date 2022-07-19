package com.mattams.mattamsmod.materials;

import com.mattams.mattamsmod.MattamsMod;
import com.mattams.mattamsmod.brass.BrassItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum MattamsArmorMaterials implements ArmorMaterial {
    BRASS("brass", 15, new int[]{2, 5, 6, 2}, 15, SoundEvents.ARMOR_EQUIP_IRON, 0.5F, 0.0F, () -> {
        return Ingredient.of(BrassItems.BRASS_INGOT.get());
    });
    /*TITANIUM("titanium", 45, new int[]{4, 7, 10, 4}, 25, SoundEvents.ARMOR_EQUIP_IRON, 4.0F, 0.5F, () -> {
        return Ingredient.of(TitaniumItems.TITANIUM_INGOT.get());
    }),
    CITRINE("citrine", 20, new int[]{3, 5, 7, 3}, 15, SoundEvents.ARMOR_EQUIP_IRON, 1.5F, 1.0F, () -> {
        return Ingredient.of(CitrineItems.CITRINE.get());
    });*/

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private MattamsArmorMaterials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return MattamsMod.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
