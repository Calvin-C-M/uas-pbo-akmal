/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Calvin C M
 */
public class InvalidTimeException extends Exception {
    InvalidTimeException() {
        super("Anda salah memasukkan format waktu (hh:mm:ss)");
    }
}
