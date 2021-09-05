package com.sammy.reflavored.client.renderer;

import com.sammy.reflavored.ReflavoredHelper;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.util.ResourceLocation;

public class ReflavoredBoatRenderer extends BoatRenderer
{
    private final ResourceLocation boatTexture;
    public ReflavoredBoatRenderer(EntityRendererManager renderManagerIn, String textureName)
    {
        super(renderManagerIn);
        boatTexture = ReflavoredHelper.prefix("textures/entity/boat/" + textureName + "_boat.png");
    }

    @Override
    public ResourceLocation getEntityTexture(BoatEntity entity)
    {
        return boatTexture;
    }
}
