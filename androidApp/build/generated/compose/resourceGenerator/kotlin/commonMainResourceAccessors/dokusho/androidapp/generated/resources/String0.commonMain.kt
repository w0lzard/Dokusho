@file:OptIn(org.jetbrains.compose.resources.InternalResourceApi::class)

package dokusho.androidapp.generated.resources

import kotlin.OptIn
import kotlin.String
import kotlin.collections.MutableMap
import org.jetbrains.compose.resources.InternalResourceApi
import org.jetbrains.compose.resources.StringResource

private object CommonMainString0 {
  public val search_hint: StringResource by 
      lazy { init_search_hint() }
}

@InternalResourceApi
internal fun _collectCommonMainString0Resources(map: MutableMap<String, StringResource>) {
  map.put("search_hint", CommonMainString0.search_hint)
}

internal val Res.string.search_hint: StringResource
  get() = CommonMainString0.search_hint

private fun init_search_hint(): StringResource = org.jetbrains.compose.resources.StringResource(
  "string:search_hint", "search_hint",
    setOf(
      org.jetbrains.compose.resources.ResourceItem(setOf(),
    "composeResources/dokusho.androidapp.generated.resources/values/strings.commonMain.cvr", 10,
    35),
    )
)
