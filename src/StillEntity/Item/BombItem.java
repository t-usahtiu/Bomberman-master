package StillEntity.Item;

import Character.Bomber.Bomber;
import Main.GamePanel;
import Constant.Sprite;
import Main.Time;

public class BombItem extends Item{

    public BombItem(int x, int y) {
        super(Sprite.bombItem, x, y);
    }

    @Override
    public void update(Bomber bomber) {
        if(this.collide) return;
        if(this.x /size == bomber.getX() /size && this.y/size == bomber.getY()/size) {
            this.collide = true;
            bomber.setCountBoom();
            GamePanel.setCountBoom();
            this.time = new Time();
        }
    }

    @Override
    public void update(){
        if(this.collide && this.time.check(20)) {
            this.hidden = true;
        }
    }
}
