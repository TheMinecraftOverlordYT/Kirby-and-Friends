package pigman.entities;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;


public class ModelNewSnowman extends ModelBase
{

            public ModelNewSnowman()
            {
                float var1 = 4F;
                float var2 = 0.0F;
                Piece3 = (new ModelRenderer(this, 0, 0)).setTextureSize(64, 64);
		        
		        Piece3.addBox(-4F, -8F, -4F, 8, 8, 8, var2 - 0.5F);
                Piece3.setRotationPoint(0.0F, 0.0F + var1, 0.0F);
                Piece3.setTextureOffset(32, 8).addBox(-5F, -9F, -5F, 10, 2, 10, var2 - 0.5F);
                Piece3.setRotationPoint(0.0F, 0.0F + var1, 0.0F);
                Piece3.setTextureOffset(32, 8).addBox(-4F, -16F, -4F, 8, 10, 8, var2 - 0.5F);
                Piece3.setRotationPoint(0.0F, 0.0F + var1, 0.0F);
                Piece3.addBox(-1F, -5F, -8F, 2, 2, 8, var2 - 0.5F);
                Piece3.setTextureOffset(40, 32).addBox(-1F, -5F, -8F, 2, 2, 8, var2 - 0.5F);
                Piece3.setRotationPoint(0.0F, 0.0F + var1, 0.0F);
                Piece4 = (new ModelRenderer(this, 32, 0)).setTextureSize(64, 64);
                Piece4.addBox(-1F, 0.0F, -1F, 12, 2, 2, var2 - 0.5F);
                Piece4.setRotationPoint(0.0F, (0.0F + var1 + 9F) - 7F, 0.0F);
                Piece5 = (new ModelRenderer(this, 32, 0)).setTextureSize(64, 64);
                Piece5.addBox(-1F, 0.0F, -1F, 12, 2, 2, var2 - 0.5F);
                Piece5.setRotationPoint(0.0F, (0.0F + var1 + 9F) - 7F, 0.0F);
                Piece1 = (new ModelRenderer(this, 0, 16)).setTextureSize(64, 64);
                Piece1.addBox(-5F, -10F, -5F, 10, 10, 10, var2 - 0.5F);
                Piece1.setRotationPoint(0.0F, 0.0F + var1 + 9F, 0.0F);
                Piece2 = (new ModelRenderer(this, 0, 36)).setTextureSize(64, 64);
                Piece2.addBox(-6F, -12F, -6F, 12, 12, 12, var2 - 0.5F);
                Piece2.setRotationPoint(0.0F, 0.0F + var1 + 20F, 0.0F);
            }

            public void render(float par1, float par2, float par3, float par4, float par5, float par6)
            {
                super.render(null, par1, par2, par3, par4, par5, par6);
                Piece3.offsetX = par4 / 57.29578F;
                Piece3.offsetZ = par5 / 57.29578F;
                Piece1.offsetX = (par4 / 57.29578F) * 0.25F;
                float var7 = MathHelper.cos(Piece1.rotateAngleY);
                float var8 = MathHelper.sin(Piece1.rotateAngleY);
                Piece4.offsetX = 1.0F;
                Piece5.offsetX = -1F;
                Piece4.offsetX = 0.0F + Piece1.offsetX;
                Piece5.offsetX = 3.141593F + Piece1.offsetX;
                Piece4.rotateAngleX = var8 * 5F;
                Piece4.rotationPointZ = -var7 * 5F;
                Piece5.rotateAngleX = -var8 * 5F;
                Piece5.rotationPointZ = var7 * 5F;
            }

            public void setRotationAngles(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7)
            {
              render(par2, par3, par4, par5, par6, par7);
              Piece1.render(par7);
              Piece2.render(par7);
              Piece3.render(par7);
              Piece4.render(par7);
              Piece5.render(par7);
            }
            
            public ModelRenderer Piece1;
            public ModelRenderer Piece2;
            public ModelRenderer Piece3;
            public ModelRenderer Piece4;
            public ModelRenderer Piece5;
            public ModelRenderer Piece6;
}
