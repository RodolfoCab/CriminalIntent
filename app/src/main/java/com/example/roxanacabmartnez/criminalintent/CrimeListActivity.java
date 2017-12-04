package com.example.roxanacabmartnez.criminalintent;
import android.support.v4.app.Fragment;

/**
 * Created by Roxana Cab Martínez on 30/11/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
