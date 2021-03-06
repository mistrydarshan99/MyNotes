package com.vikram.mynotes.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.vikram.mynotes.ui.home.HomeViewModel
import com.vikram.mynotes.util.ViewModelFactory
import com.vikram.mynotes.di.scope.ViewModelScope
import com.vikram.mynotes.ui.addnote.AddNoteViewModel
import com.vikram.mynotes.ui.shownote.DisplayNoteViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelScope(HomeViewModel::class)
    abstract fun bindHomeViewModel(homeViewModel: HomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelScope(AddNoteViewModel::class)
    abstract fun bindAddNoteViewModel(addNoteViewModel: AddNoteViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelScope(DisplayNoteViewModel::class)
    abstract fun bindDisplayNoteViewModel(displayNoteViewModel: DisplayNoteViewModel): ViewModel

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}