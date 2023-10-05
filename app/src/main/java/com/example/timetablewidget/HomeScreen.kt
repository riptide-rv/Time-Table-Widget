package com.example.timetablewidget

import android.content.res.Configuration
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.timetablewidget.ui.theme.TimetablewidgetTheme

@Composable
fun HomeSreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column {
            Row {
                for (i in 1..7)
                    TableCellPeriod("MPMC")

            }
        }
    }
}

@Composable
fun TableCellPeriod(content:String) {
    Surface(
        shape = MaterialTheme.shapes.extraSmall,
        modifier = Modifier
            .border(1.dp,MaterialTheme.colorScheme.secondaryContainer,MaterialTheme.shapes.extraSmall)) {
        Text(
            text = content,
            modifier = Modifier
                .padding(6.dp),
            fontSize = 12.sp

        )
    }

}
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL)
@Composable
fun HomeScreenPrev() {

        TimetablewidgetTheme {
            Surface(
                modifier = Modifier.fillMaxSize()
            ) {
                HomeSreen()
            }
        }

}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES or Configuration.UI_MODE_TYPE_NORMAL)
@Composable
fun TableCellPeriodPreview() {
    TimetablewidgetTheme {
        TableCellPeriod("MPMC")
    }
}
