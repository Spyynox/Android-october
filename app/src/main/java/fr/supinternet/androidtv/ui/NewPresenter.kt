package fr.supinternet.androidtv.ui

import android.view.ViewGroup
import androidx.leanback.widget.ImageCardView
import androidx.leanback.widget.Presenter
import fr.supinternet.androidtv.data.network.model.Movie

class NewPresenter: Presenter() {
    override fun onCreateViewHolder(parent: ViewGroup?): ViewHolder  {
        return CardViewHolder(ImageCardView(parent?.context))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder?, item: Any?) {
        // On récupère l'objet de la requête
        val movie = item as Movie

        // On récupère le ViewHolder et l'ImageCardView
        val holder = viewHolder as CardViewHolder
        val img = holder.card

        // TODO Remplir le contenu de la carte à partir de l'objet Movie

        img.titleText = movie.name
        if (img.contentText !== null) {
            img.contentText = movie.rating.toString()
        }
        if (movie.posterURL !== null) {
            holder.loadImage(movie.posterURL)
        }
    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder?) {
        // Nous ne l'utiliserons pas
    }
}