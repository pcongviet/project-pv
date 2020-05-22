package javapart4;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int tinhChuVi() {
        return 2 * (width+height) ;
    }

    public int tinhDienTich() {
        return   width * height;
    }
    public void inwidth(){
        System.out.println("width: " + width);
    }
    public void inheight() {
        System.out.println("height: " + height);
    }
    public void ss(){
        if (width<height||width>height){
            System.out.println("ko phai hinh vuong");
        }
        else
            System.out.println("la hinh vuong");
    }




}
