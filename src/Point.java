import java.awt.*;

/**
 * Created by vroyibg on 8/2/16.
 */
public class Point {
    public int x;

    public int getX() {
        return x;
    }

    public int y;

    public int getY() {
        return y;
    }

    private Piece piece;

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Point(int x, int y, Piece piece){
        this.piece=piece;
        this.x=x;
        this.y=y;
    }
    public void drawPiece(Graphics graphics,int size){
        if(piece==null) return;
        else{
            piece.draw(graphics,x,y,size);
        }
    }

}
