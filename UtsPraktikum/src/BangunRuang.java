public class BangunRuang {
    public int luas (int sisi){
        return sisi*sisi*sisi;
    }
    public int volume (int sisi){
        return 6*sisi*sisi;
    }
    public double luas (double jariJari){
        return 4*3.14*jariJari*jariJari;
    }
    public double volume (double jariJari){
        return 4/3*3.14*jariJari*jariJari*jariJari;
    }
    public double luas (double tinggi, double sisi){
        return sisi*sisi+4;
    }
    public double volume (double tinggi, double sisi){
        return 1/3*sisi*sisi*tinggi;
    }

    public void tampilkanHasil(){

    }
}
