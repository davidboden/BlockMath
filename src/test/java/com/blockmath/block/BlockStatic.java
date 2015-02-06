package com.blockmath.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockAir;
import net.minecraft.block.BlockStone;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class BlockStatic {

	private static class AirBlock extends BlockAir {
		//Work around protected constructor
	}
	
	public static final BlockAir air = new AirBlock();
	public static final BlockStone stone = new BlockStone();
	public static final WholeFractionBlock oneBlock = new WholeFractionBlock();
	private static final SlabManager quarterSlabManager = new SlabManager();
	public static final QuarterFractionBlock quarterBlock = new QuarterFractionBlock(quarterSlabManager);
	public static final FractionSlab quarterSlab = new FractionSlab("QuarterSlab", 15, quarterSlabManager);
	
	public static BiMap<String, Block> blocksByName = HashBiMap.create();
	static {
		blocksByName.put("air", air);
		blocksByName.put("stone", stone);
		blocksByName.put("whole_fraction", oneBlock);
		blocksByName.put("quarter_fraction", quarterBlock);
		blocksByName.put("quarter_fraction_slab", quarterSlab);
	}
}