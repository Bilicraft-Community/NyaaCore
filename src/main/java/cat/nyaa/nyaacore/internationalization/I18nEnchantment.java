package cat.nyaa.nyaacore.internationalization;

/*
 * Copyright (c) 2015 Hexosse
 *
 * This project is Open Source and distributed under The MIT License (MIT)
 * (http://opensource.org/licenses/MIT)
 *
 * You should have received a copy of the The MIT License along with
 * this project.   If not, see <http://opensource.org/licenses/MIT>.
 */

import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TranslatableComponent;
import org.bukkit.enchantments.Enchantment;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* https://raw.githubusercontent.com/MascusJeoraly/LanguageUtils/master/src/main/java/com/meowj/langutils/lang/convert/EnumEnchantment.java
 * Adapted by RecursiveG
 * 2016 July 29
 */

/**
 * This file is part of LanguageUtils
 * <p>
 * A list of enchantments.
 *
 * @author <b>hexosse</b> (<a href="https://github.com/hexosse">hexosse on GitHub</a>).
 */
@SuppressWarnings("unused")
public enum I18nEnchantment {

    PROTECTION_ENVIRONMENTAL(Enchantment.PROTECTION_ENVIRONMENTAL, "enchantment.protect.all"),
    PROTECTION_FIRE(Enchantment.PROTECTION_FIRE, "enchantment.protect.fire"),
    PROTECTION_FALL(Enchantment.PROTECTION_FALL, "enchantment.protect.fall"),
    PROTECTION_EXPLOSIONS(Enchantment.PROTECTION_EXPLOSIONS, "enchantment.protect.explosion"),
    PROTECTION_PROJECTILE(Enchantment.PROTECTION_PROJECTILE, "enchantment.protect.projectile"),
    OXYGEN(Enchantment.OXYGEN, "enchantment.oxygen"),
    WATER_WORKER(Enchantment.WATER_WORKER, "enchantment.waterWorker"),
    THORNS(Enchantment.THORNS, "enchantment.thorns"),
    DEPTH_STRIDER(Enchantment.DEPTH_STRIDER, "enchantment.waterWalker"),
    FROST_WALKER(Enchantment.FROST_WALKER, "enchantment.frostWalker"),
    BINDING_CURSE(Enchantment.BINDING_CURSE, "enchantment.binding_curse"),
    DAMAGE_ALL(Enchantment.DAMAGE_ALL, "enchantment.damage.all"),
    DAMAGE_UNDEAD(Enchantment.DAMAGE_UNDEAD, "enchantment.damage.undead"),
    DAMAGE_ARTHROPODS(Enchantment.DAMAGE_ARTHROPODS, "enchantment.damage.arthropods"),
    KNOCKBACK(Enchantment.KNOCKBACK, "enchantment.knockback"),
    FIRE_ASPECT(Enchantment.FIRE_ASPECT, "enchantment.fire"),
    LOOT_BONUS_MOBS(Enchantment.LOOT_BONUS_MOBS, "enchantment.lootBonus"),
    SWEEPING_EDGE(Enchantment.SWEEPING_EDGE, "enchantment.sweeping"),
    DIG_SPEED(Enchantment.DIG_SPEED, "enchantment.digging"),
    SILK_TOUCH(Enchantment.SILK_TOUCH, "enchantment.untouching"),
    DURABILITY(Enchantment.DURABILITY, "enchantment.durability"),
    LOOT_BONUS_BLOCKS(Enchantment.LOOT_BONUS_BLOCKS, "enchantment.lootBonusDigger"),
    ARROW_DAMAGE(Enchantment.ARROW_DAMAGE, "enchantment.arrowDamage"),
    ARROW_KNOCKBACK(Enchantment.ARROW_KNOCKBACK, "enchantment.arrowKnockback"),
    ARROW_FIRE(Enchantment.ARROW_FIRE, "enchantment.arrowFire"),
    ARROW_INFINITE(Enchantment.ARROW_INFINITE, "enchantment.arrowInfinite"),
    LUCK(Enchantment.LUCK, "enchantment.lootBonusFishing"),
    LURE(Enchantment.LURE, "enchantment.fishingSpeed"),
    MENDING(Enchantment.MENDING, "enchantment.mending"),
    VANISHING_CURSE(Enchantment.VANISHING_CURSE, "enchantment.vanishing_curse");

    private static final Map<Enchantment, I18nEnchantment> lookup = new HashMap<>();

    static {
        for (I18nEnchantment enchantment : EnumSet.allOf(I18nEnchantment.class))
            lookup.put(enchantment.enchantment, enchantment);
    }

    private final Enchantment enchantment;
    private final String unlocalizedName;

    /**
     * Create an index of enchantments.
     */
    I18nEnchantment(Enchantment enchantment, String unlocalizedName) {
        this.enchantment = enchantment;
        this.unlocalizedName = unlocalizedName;
    }

    /**
     * @return The {@link Enchantment} of the enchantment.
     */
    public Enchantment getEnchantment() {
        return enchantment;
    }

    /**
     * @return The unlocalized name of the enchantment.
     */
    public String getUnlocalizedNameString() {
        return unlocalizedName;
    }

    /**
     * Get the index of an enchantment based on {@link I18nEnchantment}.
     *
     * @param ench The enchantment.
     * @return The index of the item.
     */
    public static I18nEnchantment fromEnchantment(Enchantment ench) {
        return lookup.getOrDefault(ench, null);
    }

    public BaseComponent getUnlocalizedName() {
        return new TranslatableComponent(unlocalizedName);
    }
}
