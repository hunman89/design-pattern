package main.java.me.hunman.designpatterns.singleton;

//enum으로 구현해도 된다.
// public enum Settings{
//     INSTANCE;
// }
public class Settings {

    private Settings() {
    }

    public static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    public static Settings getInstance() {
        return SettingsHolder.INSTANCE;
    }

    // // bouble checked locking
    // public static synchronized Settings getInstance() {
    // if (instance == null) {
    // synchronized (Settings.class) {
    // if (instance == null) {
    // instance = new Settings();
    // }
    // }
    // }
    // return instance;
    // }
}
