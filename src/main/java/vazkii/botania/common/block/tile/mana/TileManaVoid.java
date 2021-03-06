/*
 * This class is distributed as part of the Botania Mod.
 * Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 *
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 */
package vazkii.botania.common.block.tile.mana;

import vazkii.botania.api.mana.IClientManaHandler;
import vazkii.botania.client.fx.SparkleParticleData;
import vazkii.botania.common.block.tile.ModTiles;
import vazkii.botania.common.block.tile.TileMod;

public class TileManaVoid extends TileMod implements IClientManaHandler {
	public TileManaVoid() {
		super(ModTiles.MANA_VOID);
	}

	@Override
	public int getCurrentMana() {
		return 0;
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public void receiveMana(int mana) {
		if (mana > 0) {
			for (int i = 0; i < 10; i++) {
				SparkleParticleData data = SparkleParticleData.sparkle(0.7F + 0.5F * (float) Math.random(), 0.2F, 0.2F, 0.2F, 5);
				world.addParticle(data, pos.getX() + Math.random(), pos.getY() + Math.random(), pos.getZ() + Math.random(), 0, 0, 0);
			}
		}
	}

	@Override
	public boolean canReceiveManaFromBursts() {
		return true;
	}

}
