package entwicklung.example.project

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cmpdemoapp.composeapp.generated.resources.Res
import cmpdemoapp.composeapp.generated.resources.back_button
import cmpdemoapp.composeapp.generated.resources.home_screen_title
import cmpdemoapp.composeapp.generated.resources.login_screen_title
import cmpdemoapp.composeapp.generated.resources.register_screen_title
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource

/**
 * enum values that represent the screen in the app
 */
enum class screen(var title: StringResource) {
    HOME(title = Res.string.home_screen_title),
    LOGIN(title = Res.string.login_screen_title),
    REGISTER(title = Res.string.register_screen_title)
}

/**
 * Composable that displays the topBar and displays back button if back navigation is possible.
 */
@Composable
fun HomeAppBar(
    currentScreen: screen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(stringResource(currentScreen.title)) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer
        ),
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        contentDescription = stringResource(Res.string.back_button)
                    )
                }
            }
        }
    )
}
