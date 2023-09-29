package com.example.timetablewidget

import android.content.Context
import androidx.compose.material3.MaterialTheme

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.action.actionStartActivity
import androidx.glance.action.clickable
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.background
import androidx.glance.appwidget.cornerRadius
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.padding
import androidx.glance.layout.wrapContentSize
import androidx.glance.text.Text

class TimetableWidget : GlanceAppWidget() {
    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            ContentView()
        }
    }
    @Composable
    private fun ContentView(){
        Column(
            modifier = GlanceModifier
                .wrapContentSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalAlignment = Alignment.CenterVertically
        ) {

              Text(
                  text = "MPMC",
                  modifier = GlanceModifier
                      .clickable(
                          onClick = actionStartActivity<MainActivity>()
                      )
                      .padding(16.dp)
                      .cornerRadius(8.dp)
                      .background(
                          day = MaterialTheme.colorScheme.background,
                          night = MaterialTheme.colorScheme.background),

              )
          }



    }

}