
import NoteInterfaceModule.NoteInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Client {
    public static void main(String[] args) {
        try {
            // Intialisation de l'orb
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);
            // Utilisation directe de l'IOR (SAUF utilisation du service de nommage)
            org.omg.CORBA.Object distantNote = orb.string_to_object("IOR:000000000000002a49444c3a4e6f7465496e746572666163654d6f64756c652f4e6f7465496e746572666163653a312e3000000000000001000000000000008a00010200000000103139322e3136382e3230392e31323300f9aa000000000031afabcb0000000020859be88d00000001000000000000000100000008526f6f74504f410000000008000000010000000014000000000000020000000100000020000000000001000100000002050100010001002000010109000000010001010000000026000000020002"  );
            // Casting de l'objet CORBA au type convertisseur euro
            NoteInterface note =NoteInterfaceModule.NoteInterfaceHelper.narrow(distantNote);
            System.out.println("Note = "+note.getNote((short) 999, "Base de donnée"));
            }
        catch (Exception e) {
            e.printStackTrace();
            }
        }
    
}
