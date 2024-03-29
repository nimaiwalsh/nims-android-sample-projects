package com.nims.authenticationform.ui

import androidx.compose.material.AlertDialog
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.nims.R
import com.nims.Tags.AuthenticationForm.TAG_ERROR_ALERT

@Composable
fun AuthenticationErrorDialog(
    modifier: Modifier = Modifier,
    error: String,
    dismissError: () -> Unit
) {
    AlertDialog(
        modifier = modifier.testTag(TAG_ERROR_ALERT),
        onDismissRequest = { dismissError() },
        confirmButton = {
            TextButton(onClick = { dismissError() }) {
                Text(text = stringResource(id = R.string.error_action).uppercase())
            }
        },
        title = {
            Text(text = stringResource(id = R.string.error_title), fontSize = 18.sp)
        },
        text = {
            Text(text = error, fontSize = 18.sp)
        },
    )
}