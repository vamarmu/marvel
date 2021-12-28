package com.vamarmu.marvel.di

import com.vamarmu.data.repository.Repository
import com.vamarmu.usecases.GetCharactersUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped


@Module
@InstallIn ( ViewModelComponent::class)
object UseCasesModule {

    @Provides
    @ViewModelScoped
    fun charactersUseCaseProvider (
        repository: Repository
    ) : GetCharactersUseCase = GetCharactersUseCase(repository = repository)
/*
    @Provides
    fun getDetailCharacterUseCaseProvider (
        repository: Repository
    ) : GetDetailCharacterUseCase = GetDetailCharacterUseCase() //TODO not implemented

 */


}