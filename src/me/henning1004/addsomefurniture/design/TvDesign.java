package me.henning1004.addsomefurniture.design;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;

public class TvDesign extends GenericBlockDesign
{
	public TvDesign(Main plugin, int[] textureids){
		
		texture = RegisterTextures.texOther;
		setBoundingBox(0,0,0,1,1,1).setQuadNumber(22);
		setTexture(plugin, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);
		SubTexture subTex1 = texture.getSubTexture(textureids[0]);
		SubTexture subTex2 = texture.getSubTexture(textureids[1]);
		SubTexture subTex3 = texture.getSubTexture(textureids[2]);
		
        Quad oben = new Quad(0, subTex2);
        oben.addVertex(0, 0.05F, 0.8F, 0.0F);
        oben.addVertex(1, 0.05F, 0.8F, 0.8F);
        oben.addVertex(2, 0.95F, 0.8F, 0.8F);
        oben.addVertex(3, 0.95F, 0.8F, 0.0F);
        
        Quad unten = new Quad(1, subTex2);
		unten.addVertex(0, 0.05F, 0.0F, 0.8F);
		unten.addVertex(1, 0.05F, 0.0F, 0.0F);
		unten.addVertex(2, 0.95F, 0.0F, 0.0F);
		unten.addVertex(3, 0.95F, 0.0F, 0.8F);
		
        Quad tops1 = new Quad(2, subTex3);
        tops1.addVertex(0, 0.05F, 0.8F, 0.8F);
        tops1.addVertex(1, 0.05F, 0.0F, 0.8F);
        tops1.addVertex(2, 0.95F, 0.0F, 0.8F);
        tops1.addVertex(3, 0.95F, 0.8F, 0.8F);
        
        Quad tops2 = new Quad(3, subTex2);
        tops2.addVertex(0, 0.95F, 0.8F, 0.8F);
        tops2.addVertex(1, 0.95F, 0.0F, 0.8F);
        tops2.addVertex(2, 0.95F, 0.0F, 0.0F);
        tops2.addVertex(3, 0.95F, 0.8F, 0.0F);
        
        Quad tops3 = new Quad(4, subTex2);
        tops3.addVertex(0, 0.95F, 0.8F, 0.0F);
        tops3.addVertex(1, 0.95F, 0.0F, 0.0F);
        tops3.addVertex(2, 0.05F, 0.0F, 0.0F);
        tops3.addVertex(3, 0.05F, 0.8F, 0.0F);
        
        Quad tops4 = new Quad(5, subTex2);
        tops4.addVertex(0, 0.05F, 0.8F, 0.0F);
        tops4.addVertex(1, 0.05F, 0.0F, 0.0F);
        tops4.addVertex(2, 0.05F, 0.0F, 0.8F);
        tops4.addVertex(3, 0.05F, 0.8F, 0.8F);
        
        Quad ants1 = new Quad(6, subTex1);
        ants1.addVertex(0, 0.25F, 1.3F, 0.55F);
        ants1.addVertex(1, 0.45F, 0.8F, 0.45F);
        ants1.addVertex(2, 0.55F, 0.8F, 0.45F);
        ants1.addVertex(3, 0.35F, 1.3F, 0.55F);
        
        Quad ants2 = new Quad(7, subTex1);
        ants2.addVertex(0, 0.25F, 1.3F, 0.45F);
        ants2.addVertex(1, 0.45F, 0.8F, 0.35F);
        ants2.addVertex(2, 0.45F, 0.8F, 0.45F);
        ants2.addVertex(3, 0.25F, 1.3F, 0.55F);
        
        Quad ants3 = new Quad(8, subTex1);
        ants3.addVertex(0, 0.35F, 1.3F, 0.45F);
        ants3.addVertex(1, 0.55F, 0.8F, 0.35F);
        ants3.addVertex(2, 0.45F, 0.8F, 0.35F);
        ants3.addVertex(3, 0.25F, 1.3F, 0.45F);
        
        Quad ants4 = new Quad(9, subTex1);
        ants4.addVertex(0, 0.35F, 1.3F, 0.55F);
        ants4.addVertex(1, 0.55F, 0.8F, 0.45F);
        ants4.addVertex(2, 0.55F, 0.8F, 0.35F);
        ants4.addVertex(3, 0.35F, 1.3F, 0.45F);
        
        Quad anttop = new Quad(10, subTex1);
        anttop.addVertex(0, 0.25F, 1.3F, 0.45F);
        anttop.addVertex(1, 0.25F, 1.3F, 0.55F);
        anttop.addVertex(2, 0.35F, 1.3F, 0.55F);
        anttop.addVertex(3, 0.35F, 1.3F, 0.45F);
        
        Quad ants11 = new Quad(11, subTex1);
        ants11.addVertex(0, 0.75F, 1.3F, 0.35F);
        ants11.addVertex(1, 0.45F, 0.8F, 0.45F);
        ants11.addVertex(2, 0.55F, 0.8F, 0.45F);
        ants11.addVertex(3, 0.85F, 1.3F, 0.35F);
        
        Quad ants21 = new Quad(12, subTex1);
        ants21.addVertex(0, 0.75F, 1.3F, 0.25F);
        ants21.addVertex(1, 0.45F, 0.8F, 0.35F);
        ants21.addVertex(2, 0.45F, 0.8F, 0.45F);
        ants21.addVertex(3, 0.75F, 1.3F, 0.35F);
        
        Quad ants31 = new Quad(13, subTex1);
        ants31.addVertex(0, 0.85F, 1.3F, 0.25F);
        ants31.addVertex(1, 0.55F, 0.8F, 0.35F);
        ants31.addVertex(2, 0.45F, 0.8F, 0.35F);
        ants31.addVertex(3, 0.75F, 1.3F, 0.25F);
        
        Quad ants41 = new Quad(14, subTex1);
        ants41.addVertex(0, 0.85F, 1.3F, 0.35F);
        ants41.addVertex(1, 0.55F, 0.8F, 0.45F);
        ants41.addVertex(2, 0.55F, 0.8F, 0.35F);
        ants41.addVertex(3, 0.85F, 1.3F, 0.25F);
        
        Quad anttop1 = new Quad(15, subTex1);
        anttop1.addVertex(0, 0.75F, 1.3F, 0.25F);
        anttop1.addVertex(1, 0.75F, 1.3F, 0.35F);
        anttop1.addVertex(2, 0.85F, 1.3F, 0.35F);
        anttop1.addVertex(3, 0.85F, 1.3F, 0.25F);
        
        setQuad(unten).setQuad(oben).setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4).setQuad(anttop).setQuad(ants1).setQuad(ants4).setQuad(ants3).setQuad(ants2).setQuad(anttop1).setQuad(ants11).setQuad(ants41).setQuad(ants31).setQuad(ants21);
		}
}
