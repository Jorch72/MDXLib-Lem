package com.arisux.mdx.lib.world.tile;

import net.minecraft.util.EnumFacing;

public interface IRotatable
{
    public EnumFacing getDirection();

    public void setDirection(EnumFacing facing);
}