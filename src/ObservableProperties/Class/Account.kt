package ObservableProperties.Class

import kotlin.properties.Delegates

class Account(description: String = "") {

   var description: String by Delegates.observable(description){
       property, oldValue, newValue ->
       println("${property.name} has changed from $oldValue to $newValue")
   }
}