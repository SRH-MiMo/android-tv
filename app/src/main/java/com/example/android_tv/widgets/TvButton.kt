package com.example.android_tv.widgets

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.tv.material3.Border
import androidx.tv.material3.ClickableSurfaceBorder
import androidx.tv.material3.ClickableSurfaceColors
import androidx.tv.material3.ClickableSurfaceDefaults
import androidx.tv.material3.ClickableSurfaceScale
import androidx.tv.material3.ClickableSurfaceShape
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.MaterialTheme.colorScheme
import androidx.tv.material3.Surface
import androidx.tv.material3.Text
import com.example.android_tv.ui.theme.Pink80
import com.example.android_tv.ui.theme.Purple80
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun TvButton(
    modifier: Modifier = Modifier,
    borderRadius: Dp = 8.dp,
    scale: ClickableSurfaceScale = ClickableSurfaceDefaults.scale(focusedScale = 1.1f),
    color: ClickableSurfaceColors = ClickableSurfaceDefaults.colors(
        containerColor = Color.Transparent,
        focusedContainerColor = Color.Transparent,
        contentColor = colorScheme.surface,
        focusedContentColor = colorScheme.onSurface
    ),
    border: ClickableSurfaceBorder = ClickableSurfaceDefaults.border(
        focusedBorder = Border(
            BorderStroke(
                width = 2.dp,
                color = Color.Transparent
            ),
            shape = RoundedCornerShape(borderRadius)
        )
    ),
    shape: ClickableSurfaceShape = ClickableSurfaceDefaults.shape(
        shape = RoundedCornerShape(borderRadius),
        focusedShape = RoundedCornerShape(borderRadius)
    ),
    onClick: () -> Unit,
    content: @Composable (BoxScope.() -> Unit)
) {
    Surface(
        onClick = { onClick() },
        scale = scale,
        colors = color,
        border = border,
        shape = shape,
        modifier = modifier
            .fillMaxWidth(),
    ) { content() }
}

@OptIn(ExperimentalTvMaterial3Api::class)
@Preview
@Composable
private fun TvButtonPreview() {
    TvButton(onClick = {}) {
        Text(text = "Preview Text")
    }
}