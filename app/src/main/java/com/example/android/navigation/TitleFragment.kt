package com.example.android.navigation

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)
        binding.playButton.setOnClickListener{
            //Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
                view: View ->
                //    Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_gameFragment)
                    view.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToGameFragment())
        }
        // Create the new menu resource (res/menu/overflow_menu.xml) and add an About menu item with the ID aboutFragment
        // Call setHasOptionsMenu(true)
        setHasOptionsMenu(true)
        return binding.root
    }

    // Override onOptionsItemsSelected : Return true if NavigationUI.onNavDestinationSelected returns true,
    // else return super.onOptionsItemsSelected
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!, view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }
}