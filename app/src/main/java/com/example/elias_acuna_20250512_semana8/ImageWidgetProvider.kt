package com.example.elias_acuna_20250512_semana8

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews

class ImageWidgetProvider : AppWidgetProvider() {
    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        for (appWidgetId in appWidgetIds) {
            val views = RemoteViews(context.packageName, R.layout.widget_layout)

            views.setImageViewResource(R.id.img1, R.drawable.arte1)
            views.setImageViewResource(R.id.img2, R.drawable.arte2)
            views.setImageViewResource(R.id.img3, R.drawable.arte3)
            views.setImageViewResource(R.id.img4, R.drawable.arte4)
            views.setImageViewResource(R.id.img5, R.drawable.arte5)

            appWidgetManager.updateAppWidget(appWidgetId, views)
        }
    }
}

