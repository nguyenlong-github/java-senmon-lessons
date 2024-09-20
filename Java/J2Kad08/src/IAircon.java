public interface IAircon {
    void showData();            // 情報表示
    void powerOnOff();          // 電源ON/OFF
    void toCool();              // 冷房へ切り換え
    void toHeat();              // 暖房へ切り換え
    void toBlow();              // 送風へ切り換え
}
