package me.henning1004.addsomefurniture.design;



import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;

public class PsychoChairDesign extends GenericBlockDesign
{
	public PsychoChairDesign(Main plugin, int[] textureids){
		
		texture = RegisterTextures.texChair;
		setBoundingBox(0.1F,0,0.1F,0.9F,1.35F,0.9F).setQuadNumber(27);
		setTexture(plugin, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);
		SubTexture subTex0 = texture.getSubTexture(textureids[0]);
		SubTexture subTex1 = texture.getSubTexture(textureids[1]);
		SubTexture subTex2 = texture.getSubTexture(textureids[2]);
		SubTexture subTex3 = texture.getSubTexture(textureids[3]);
		SubTexture subTex4 = texture.getSubTexture(textureids[4]);
		SubTexture subTex5 = texture.getSubTexture(textureids[5]);
		
			Quad topB = new Quad(0, subTex1);
			topB.addVertex(0, 0.1F, 0.5F, 0.1F);
			topB.addVertex(1, 0.9F, 0.5F, 0.1F);
			topB.addVertex(2, 0.9F, 0.5F, 0.9F);
			topB.addVertex(3, 0.1F, 0.5F, 0.9F);
	        Quad topT = new Quad(1, subTex1);
	        topT.addVertex(3, 0.1F, 0.625F, 0.1F);
	        topT.addVertex(2, 0.9F, 0.625F, 0.1F);
	        topT.addVertex(1, 0.9F, 0.625F, 0.9F);
	        topT.addVertex(0, 0.1F, 0.625F, 0.9F);
	        Quad tops1 = new Quad(2, subTex2);
	        tops1.addVertex(3, 0.1F, 0.5F, 0.1F);
	        tops1.addVertex(2, 0.9F, 0.5F, 0.1F);
	        tops1.addVertex(1, 0.9F, 0.625F, 0.1F);
	        tops1.addVertex(0, 0.1F, 0.625F, 0.1F);
	        Quad tops2 = new Quad(3, subTex2);
	        tops2.addVertex(3, 0.9F, 0.5F, 0.1F);
	        tops2.addVertex(2, 0.9F, 0.5F, 0.9F);
	        tops2.addVertex(1, 0.9F, 0.625F, 0.9F);
	        tops2.addVertex(0, 0.9F, 0.625F, 0.1F);
	        Quad tops3 = new Quad(4, subTex2);
	        tops3.addVertex(3, 0.9F, 0.5F, 0.9F);
	        tops3.addVertex(2, 0.1F, 0.5F, 0.9F);
	        tops3.addVertex(1, 0.1F, 0.625F, 0.9F);
	        tops3.addVertex(0, 0.9F, 0.625F, 0.9F);
	        Quad tops4 = new Quad(5, subTex2);
	        tops4.addVertex(3, 0.1F, 0.5F, 0.9F);
	        tops4.addVertex(2, 0.1F, 0.5F, 0.1F);
	        tops4.addVertex(1, 0.1F, 0.625F, 0.1F);
	        tops4.addVertex(0, 0.1F, 0.625F, 0.9F);

	        Quad leg1s1 = new Quad(6, subTex0);
			leg1s1.addVertex(3, 0.1F, 0.0F, 0.1F);
			leg1s1.addVertex(2, 0.225F, 0.0F, 0.1F);
			leg1s1.addVertex(1, 0.225F, 0.5F, 0.1F);
			leg1s1.addVertex(0, 0.1F, 0.5F, 0.1F);
			Quad leg1s2 = new Quad(7, subTex0);
			leg1s2.addVertex(3, 0.225F, 0.0F, 0.1F);
			leg1s2.addVertex(2, 0.225F, 0.0F, 0.225F);
			leg1s2.addVertex(1, 0.225F, 0.5F, 0.225F);
			leg1s2.addVertex(0, 0.225F, 0.5F, 0.1F);
			Quad leg1s3 = new Quad(8, subTex0);
			leg1s3.addVertex(3, 0.225F, 0.0F, 0.225F);
			leg1s3.addVertex(2, 0.1F, 0.0F, 0.225F);
			leg1s3.addVertex(1, 0.1F, 0.5F, 0.225F);
			leg1s3.addVertex(0, 0.225F, 0.5F, 0.225F);
			Quad leg1s4 = new Quad(9, subTex0);
			leg1s4.addVertex(3, 0.1F, 0.0F, 0.225F);
			leg1s4.addVertex(2, 0.1F, 0.0F, 0.1F);
			leg1s4.addVertex(1, 0.1F, 0.5F, 0.1F);
			leg1s4.addVertex(0, 0.1F, 0.5F, 0.225F);
			
			Quad leg2s1 = new Quad(10, subTex0);
			leg2s1.addVertex(3, 0.1F, 0.0F, 0.775F);
			leg2s1.addVertex(2, 0.225F, 0.0F, 0.775F);
			leg2s1.addVertex(1, 0.225F,0.5F, 0.775F);
			leg2s1.addVertex(0, 0.1F, 0.5F, 0.775F);
			Quad leg2s2 = new Quad(11, subTex0);
			leg2s2.addVertex(3, 0.225F, 0.0F, 0.775F);
			leg2s2.addVertex(2, 0.225F, 0.0F, 0.9F);
			leg2s2.addVertex(1, 0.225F,0.5F, 0.9F);
			leg2s2.addVertex(0, 0.225F,0.5F, 0.775F);
			Quad leg2s3 = new Quad(12, subTex0);
			leg2s3.addVertex(3, 0.225F, 0.0F, 0.9F);
			leg2s3.addVertex(2, 0.1F, 0.0F, 0.9F);
			leg2s3.addVertex(1, 0.1F, 0.5F, 0.9F);
			leg2s3.addVertex(0, 0.225F, 0.5F, 0.9F);
			Quad leg2s4 = new Quad(13, subTex0);
			leg2s4.addVertex(3, 0.1F, 0.0F, 0.9F);
			leg2s4.addVertex(2, 0.1F, 0.0F, 0.775F);
			leg2s4.addVertex(1, 0.1F, 0.5F, 0.775F);
			leg2s4.addVertex(0, 0.1F, 0.5F, 0.9F);
			
			Quad leg3s1 = new Quad(14, subTex0);
			leg3s1.addVertex(3, 0.775F, 0.0F, 0.775F);
			leg3s1.addVertex(2, 0.9F, 0.0F, 0.775F);
			leg3s1.addVertex(1, 0.9F, 0.5F, 0.775F);
			leg3s1.addVertex(0, 0.775F, 0.5F, 0.775F);
			Quad leg3s2 = new Quad(15, subTex0);
			leg3s2.addVertex(3, 0.9F, 0.0F, 0.775F);
			leg3s2.addVertex(2, 0.9F, 0.0F, 0.9F);
			leg3s2.addVertex(1, 0.9F,0.5F, 0.9F);
			leg3s2.addVertex(0, 0.9F,0.5F, 0.775F);
			Quad leg3s3 = new Quad(16, subTex0);
			leg3s3.addVertex(3, 0.9F, 0.0F, 0.9F);
			leg3s3.addVertex(2, 0.775F, 0.0F, 0.9F);
			leg3s3.addVertex(1, 0.775F, 0.5F, 0.9F);
			leg3s3.addVertex(0, 0.9F, 0.5F, 0.9F);
			Quad leg3s4 = new Quad(17, subTex0);
			leg3s4.addVertex(3, 0.775F, 0.0F, 0.9F);
			leg3s4.addVertex(2, 0.775F, 0.0F, 0.775F);
			leg3s4.addVertex(1, 0.775F, 0.5F, 0.775F);
			leg3s4.addVertex(0, 0.775F, 0.5F, 0.9F);
			
			Quad leg4s1 = new Quad(18, subTex0);
			leg4s1.addVertex(3, 0.775F, 0.0F, 0.1F);
			leg4s1.addVertex(2, 0.9F, 0.0F, 0.1F);
			leg4s1.addVertex(1, 0.9F, 0.5F, 0.1F);
			leg4s1.addVertex(0, 0.775F, 0.5F, 0.1F);
			Quad leg4s2 = new Quad(19, subTex0);
			leg4s2.addVertex(3, 0.9F, 0.0F, 0.1F);
			leg4s2.addVertex(2, 0.9F, 0.0F, 0.225F);
			leg4s2.addVertex(1, 0.9F, 0.5F, 0.225F);
			leg4s2.addVertex(0, 0.9F, 0.5F, 0.1F);
			Quad leg4s3 = new Quad(20, subTex0);
			leg4s3.addVertex(3, 0.9F, 0.0F, 0.225F);
			leg4s3.addVertex(2, 0.775F, 0.0F, 0.225F);
			leg4s3.addVertex(1, 0.775F, 0.5F, 0.225F);
			leg4s3.addVertex(0, 0.9F, 0.5F, 0.225F);
			Quad leg4s4 = new Quad(21, subTex0);
			leg4s4.addVertex(3, 0.775F, 0.0F, 0.225F);
			leg4s4.addVertex(2, 0.775F, 0.0F, 0.1F);
			leg4s4.addVertex(1, 0.775F, 0.5F, 0.1F);
			leg4s4.addVertex(0, 0.775F, 0.5F, 0.225F);
			
			Quad backs1 = new Quad(22, subTex3);
			backs1.addVertex(3, 0.1F, 0.625F, 0.225F);
			backs1.addVertex(2, 0.1F, 1.35F, 0.225F);
			backs1.addVertex(1, 0.9F, 1.35F, 0.225F);
			backs1.addVertex(0, 0.9F, 0.625F, 0.225F);
			Quad backs2 = new Quad(23, subTex3);
			backs2.addVertex(0, 0.1F, 0.625F, 0.1F);
			backs2.addVertex(1, 0.1F, 1.35F, 0.1F);
			backs2.addVertex(2, 0.9F, 1.35F, 0.1F);
			backs2.addVertex(3, 0.9F, 0.625F, 0.1F);
			Quad backs3 = new Quad(24, subTex4);
			backs3.addVertex(3, 0.9F, 0.625F, 0.1F);
			backs3.addVertex(2, 0.9F, 0.625F, 0.225F);
			backs3.addVertex(1, 0.9F, 1.35F, 0.225F);
			backs3.addVertex(0, 0.9F, 1.35F, 0.1F);
			Quad backs4 = new Quad(25, subTex4);
			backs4.addVertex(0, 0.1F, 0.625F, 0.1F);
			backs4.addVertex(1, 0.1F, 0.625F, 0.225F);
			backs4.addVertex(2, 0.1F, 1.35F, 0.225F);
			backs4.addVertex(3, 0.1F, 1.35F, 0.1F);
			Quad backT = new Quad(26, subTex5);
			backT.addVertex(0, 0.1F, 1.35F, 0.1F);
			backT.addVertex(1, 0.1F, 1.35F, 0.225F);
			backT.addVertex(2, 0.9F, 1.35F, 0.225F);
			backT.addVertex(3, 0.9F, 1.35F, 0.1F);
			
			setQuad(topT).setQuad(topB).setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4).setQuad(leg1s1).setQuad(leg1s2).setQuad(leg1s3).setQuad(leg1s4).setQuad(leg2s1).setQuad(leg2s2).setQuad(leg2s3).setQuad(leg2s4).setQuad(leg3s1).setQuad(leg3s2).setQuad(leg3s3).setQuad(leg3s4).setQuad(leg4s1).setQuad(leg4s2).setQuad(leg4s3).setQuad(leg4s4).setQuad(backT).setQuad(backs3).setQuad(backs2).setQuad(backs1).setQuad(backs4);
	}
}
