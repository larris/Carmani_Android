package layout;


import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hovernet.carmani.R;

import butterknife.BindString;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyVehiclesFragment extends Fragment {

    private OnFragmentInteractionListener mListener;
    @BindString(R.string.menu_myVihicles) String title;



    public MyVehiclesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (mListener != null) {

            //resources.getString(R.string.menu_myVihicles).toString()
            mListener.onFragmentInteraction(title);
        }

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_vihicles, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String title);
    }

}
