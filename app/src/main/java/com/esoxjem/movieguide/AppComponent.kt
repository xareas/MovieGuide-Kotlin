package com.esoxjem.movieguide

import com.esoxjem.movieguide.movies.listing.ListingComponent
import com.esoxjem.movieguide.movies.listing.ListingModule
import dagger.Component
import javax.inject.Singleton

/**
 * @author arunsasidharan
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun plus(listingModule: ListingModule) : ListingComponent
}