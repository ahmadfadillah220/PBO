package com.pboreg;

    class Polos{
        String dataString;
        int dataInteger;
    }

    // class dengan constructor
    class Mahasiswa1{
        String nama;
        String NIM;
        String jurusan;

        Mahasiswa1(String inputNama, String inputNIM, String inputJurusan){
            nama = inputNama;
            NIM = inputNIM;
            jurusan = inputJurusan;

            System.out.println(nama);
            System.out.println(NIM);
            System.out.println(jurusan);
        }
    }

    public class Construction {
        public static void main(String[] args) throws Exception {

            Mahasiswa1 mahasiswa1 = new Mahasiswa1("fadil","2019071002","Teknik Informatika");
            Mahasiswa1 mahasiswa2 = new Mahasiswa1("waldika","2019071002","Teknik Informatika");

        }
    }
