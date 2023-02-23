package br.com.trtgames.basico;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TesteSaida {
    public static void main(String[] args) throws IOException {
        OutputStream bytes = Files.newOutputStream(Paths.get("/home/nenodias/Arquivos/arquivo.txt"));//Arquivo onde irá gravar, referência à ele
        OutputStreamWriter escreveCaractere = new OutputStreamWriter(bytes);
        try (BufferedWriter escritor = new BufferedWriter(escreveCaractere)) {
            escritor.write("Teste");
        }
    }
}
