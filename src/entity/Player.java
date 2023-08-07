package entity;
import main.GamePanel;
import main.KeyHandler;

import java.awt.*;

public class Player extends Entity{

     GamePanel gp;
     KeyHandler kh;
     public Player(GamePanel gp, KeyHandler kh){

         this.gp = gp;
         this.kh = kh;
         setDefaultValues();
     }
     public void setDefaultValues(){

         x = 100;
         y = 100;
         speed = 4;
     }
     public void update(){

         //Change player's position
         if(kh.upPressed){
             y -= speed;
         }
         if(kh.downPressed){
             y += speed;
         }
         if(kh.leftPressed){
             x -= speed;
         }
         if(kh.rightPressed){
             x += speed;
         }
     }
     public void draw(Graphics2D g2d){

         g2d.setColor(Color.white);
         g2d.fillRect(x, y, gp.tileSize, gp.tileSize);
     }

}
