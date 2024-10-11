package entwicklung.example.project.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import cmpdemoapp.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.StringResource

/**
 * enum values that represent the screen in the app
 */
/*enum class screen(var title: StringResource) {
    HOME(title = Res.string.)
}

@Composable
fun CupcakeAppBar(
    currentScreen: screen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
)*/

@Composable
fun HomeView()
{
    Column (
        modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Cyan),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home Screen",
            modifier = Modifier.padding(bottom = Dp(20.0f)))
    }
}

/*
private fun init_home(): StringResource = org.jetbrains.compose.resources.StringResource(
    "string:home", "hone",
    setOf(
        org.jetbrains.compose.resources.ResourceItem(setOf(),
            "composeResources/cupcake.composeapp.generated.resources/values/strings.commonMain.cvr", 120,
            41),
    )
)*/
