package me.henning1004.addsomefurniture.design;

import me.henning1004.addsomefurniture.Main;
import me.henning1004.addsomefurniture.register.RegisterTextures;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;

public class SimpleTableDesign extends GenericBlockDesign
{
	
	public SimpleTableDesign(Main plugin, int[] textureids) {
		
		texture = RegisterTextures.texTable;
		setBoundingBox(0.1F,0,0.1F,0.9F,1F,0.9F).setQuadNumber(11);
		setTexture(plugin, texture.getTexture()).setMinBrightness(1F).setMaxBrightness(1F);
		SubTexture subTex0 = texture.getSubTexture(textureids[0]);
		SubTexture subTex1 = texture.getSubTexture(textureids[1]);
		SubTexture subTex2 = texture.getSubTexture(textureids[2]);
		

		Quad topB = new Quad(0, subTex1);
		topB.addVertex(0, 0.1F, 0.875F, 0.1F);
		topB.addVertex(1, 0.9F, 0.875F, 0.1F);
		topB.addVertex(2, 0.9F, 0.875F, 0.9F);
		topB.addVertex(3, 0.1F, 0.875F, 0.9F);
        Quad topT = new Quad(1, subTex1);
        topT.addVertex(3, 0.1F, 1.0F, 0.1F);
        topT.addVertex(2, 0.9F, 1.0F, 0.1F);
        topT.addVertex(1, 0.9F, 1.0F, 0.9F);
        topT.addVertex(0, 0.1F, 1.0F, 0.9F);
        Quad tops1 = new Quad(2, subTex2);
        tops1.addVertex(3, 0.1F, 0.875F, 0.1F);
        tops1.addVertex(2, 0.9F, 0.875F, 0.1F);
        tops1.addVertex(1, 0.9F, 1.0F, 0.1F);
        tops1.addVertex(0, 0.1F, 1.0F, 0.1F);
        Quad tops2 = new Quad(3, subTex2);
        tops2.addVertex(3, 0.9F, 0.875F, 0.1F);
        tops2.addVertex(2, 0.9F, 0.875F, 0.9F);
        tops2.addVertex(1, 0.9F, 1.0F, 0.9F);
        tops2.addVertex(0, 0.9F, 1.0F, 0.1F);
        Quad tops3 = new Quad(4, subTex2);
        tops3.addVertex(3, 0.9F, 0.875F, 0.9F);
        tops3.addVertex(2, 0.1F, 0.875F, 0.9F);
        tops3.addVertex(1, 0.1F, 1.0F, 0.9F);
        tops3.addVertex(0, 0.9F, 1.0F, 0.9F);
        Quad tops4 = new Quad(5, subTex2);
        tops4.addVertex(3, 0.1F, 0.875F, 0.9F);
        tops4.addVertex(2, 0.1F, 0.875F, 0.1F);
        tops4.addVertex(1, 0.1F, 1.0F, 0.1F);
        tops4.addVertex(0, 0.1F, 1.0F, 0.9F);
		

		Quad part3p1 = new Quad(6, subTex0);
		part3p1.addVertex(0, 0.375F, 0.875F, 0.375F);
		part3p1.addVertex(1, 0.625F, 0.875F, 0.375F);
		part3p1.addVertex(2, 0.625F, 0F, 0.375F);
		part3p1.addVertex(3, 0.375F, 0F, 0.375F);
		setLightSource(6, 0, 0, 1);
		
		Quad part3p2 = new Quad(7, subTex0);
		part3p2.addVertex(1, 0.625F, 0.875F, 0.625F);
		part3p2.addVertex(2, 0.625F, 0F, 0.625F);
		part3p2.addVertex(3, 0.625F, 0F, 0.375F);
		part3p2.addVertex(0, 0.625F, 0.875F, 0.375F);
		
		Quad part3p3 = new Quad(8, subTex0);
		part3p3.addVertex(0, 0.625F, 0.875F, 0.625F);
		part3p3.addVertex(1, 0.375F, 0.875F, 0.625F);
		part3p3.addVertex(2, 0.375F, 0F, 0.625F);
		part3p3.addVertex(3, 0.625F, 0F, 0.625F);
	
		Quad part3p4 = new Quad(9, subTex0);
		part3p4.addVertex(1, 0.375F, 0.875F, 0.375F);
		part3p4.addVertex(2, 0.375F, 0F, 0.375F);
		part3p4.addVertex(3, 0.375F, 0F, 0.625F);
		part3p4.addVertex(0, 0.375F, 0.875F, 0.625F);

		Quad part4 = new Quad(10, subTex1);
		part4.addVertex(0, 0.625F, 0F, 0.625F);
		part4.addVertex(1, 0.375F, 0F, 0.625F);
		part4.addVertex(2, 0.375F, 0F, 0.375F);
		part4.addVertex(3, 0.625F, 0F, 0.375F);
		
		setQuad(topT).setQuad(topB).setQuad(tops1).setQuad(tops2).setQuad(tops3).setQuad(tops4).setQuad(part3p1).setQuad(part3p2).setQuad(part3p3).setQuad(part3p4).setQuad(part4);
	}
}
	
