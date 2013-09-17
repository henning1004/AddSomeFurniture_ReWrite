package me.henning1004.addsomefurniture.config;

public class TextureConfig
{

    public TextureConfig()
    {
    }

    public static void set()
    {
    	if(!Configuration.texture.contains("Table Texture"))
            Configuration.texture.set("Table Texture", "https://dl.dropbox.com/u/62050717/AddSomeFurniture/Textures/text_table.png");
        if(!Configuration.texture.contains("Chair Texture"))
            Configuration.texture.set("Chair Texture", "https://dl.dropbox.com/u/62050717/AddSomeFurniture/Textures/text_chair.png");
        if(!Configuration.texture.contains("Throne Texture"))
            Configuration.texture.set("Throne Texture", "https://dl.dropbox.com/u/62050717/AddSomeFurniture/Textures/text_throne.png");
        if(!Configuration.texture.contains("Worktop Texture"))
            Configuration.texture.set("Worktop Texture", "https://dl.dropbox.com/u/62050717/AddSomeFurniture/Textures/text_worktop.png");
        if(!Configuration.texture.contains("Other Texture"))
            Configuration.texture.set("Other Texture", "https://dl.dropbox.com/u/62050717/AddSomeFurniture/Textures/text_other.png");
       }
}
