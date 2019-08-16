package be.isach.ultracosmetics.cosmetics.pets;

import be.isach.ultracosmetics.UltraCosmetics;
import be.isach.ultracosmetics.UltraCosmeticsData;
import be.isach.ultracosmetics.cosmetics.type.PetType;
import be.isach.ultracosmetics.player.UltraPlayer;
import be.isach.ultracosmetics.util.ItemFactory;
import be.isach.ultracosmetics.util.UCMaterial;

/**
 * Represents an instance of an iron golem pet summoned by a player.
 *
 * @author RadBuilder
 * @since 07-02-2017
 */
public class PetIronGolem extends Pet {
    public PetIronGolem(UltraPlayer owner, UltraCosmetics ultraCosmetics) {
        super(owner, ultraCosmetics, PetType.getByName("irongolem"), ItemFactory.create(UCMaterial.RED_DYE, UltraCosmeticsData.get().getItemNoPickupString()));

    }
}
