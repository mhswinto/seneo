package com.android.seneo.LatihanActivity;

import com.android.seneo.R;

import java.util.ArrayList;
import java.util.List;

public class latihanAlatMusik {

    public static List<listPertanyaanAlatMusik> Pertanyaan(){
        final List<listPertanyaanAlatMusik> listPertanyaan = new ArrayList<>();

        final listPertanyaanAlatMusik questionlist1 = new listPertanyaanAlatMusik(R.drawable.alatmusik_japen, "Alat Musik Japen", "Alat Musik Jatung Utang", "Alat Musik Panting", "Alat Musik Sampe", "Alat Musik Tuma", "Alat Musik Japen", "");
        final listPertanyaanAlatMusik questionlist2  = new listPertanyaanAlatMusik(R.drawable.alatmusik_jatungutang, "Alat Musik Japen", "Alat Musik Jatung Utang", "Alat Musik Panting", "Alat Musik Sampe", "Alat Musik Tuma", "Alat Musik Jatung Utang", "");
        final listPertanyaanAlatMusik questionlist3  = new listPertanyaanAlatMusik(R.drawable.alatmusik_panting, "Alat Musik Japen", "Alat Musik Jatung Utang", "Alat Musik Panting", "Alat Musik Sampe", "Alat Musik Tuma", "Alat Musik Panting", "");
        final listPertanyaanAlatMusik questionlist4  = new listPertanyaanAlatMusik(R.drawable.alatmusik_sampe, "Alat Musik Japen", "Alat Musik Jatung Utang", "Alat Musik Panting", "Alat Musik Sampe", "Alat Musik Tuma", "Alat Musik Sampe", "");
        final listPertanyaanAlatMusik questionlist5  = new listPertanyaanAlatMusik(R.drawable.alatmusik_tuma, "Alat Musik Japen", "Alat Musik Jatung Utang", "Alat Musik Panting", "Alat Musik Sampe", "Alat Musik Tuma", "Alat Musik Tuma", "");


        listPertanyaan.add(questionlist1);
        listPertanyaan.add(questionlist2);
        listPertanyaan.add(questionlist3);
        listPertanyaan.add(questionlist4);
        listPertanyaan.add(questionlist5);

        return listPertanyaan;
    }
}
