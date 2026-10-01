public class Rehan25 {
    interface Camera { void click(); }
    interface MusicPlayer { void play(); }
    static class Phone implements Camera,MusicPlayer { public void click(){System.out.println("Photo captured");} public void play(){System.out.println("Music playing");} }
    public static void main(String[] args){Phone p=new Phone();p.click();p.play();}
}
