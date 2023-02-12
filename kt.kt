// The class representing the UI frame 
class SDUI {

    // The data to be displayed in the UI
    private var data: Any? = null
    
    // The function to update the data in the UI
    fun updateData(newData: Any?) {
        this.data = newData
        // Trigger a refresh of the UI to display the updated data
        refreshUI()
    }
    
    // The function to refresh the UI
    private fun refreshUI() {
        // Code to refresh the UI, for example, updating TextViews with new data
    }
}
