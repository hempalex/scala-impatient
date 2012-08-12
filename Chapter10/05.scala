import java.beans.{PropertyChangeSupport, PropertyChangeListener, PropertyChangeEvent}

trait PropertyChangeSupportLike {
	private val support = new PropertyChangeSupport(this)

	def addPropertyChangeListener(listener: PropertyChangeListener) {
		support.addPropertyChangeListener(listener)
	}

	def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener) {
		support.addPropertyChangeListener(propertyName, listener)
	}

	def	fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Boolean, newValue: Boolean) {
		support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)
	}

    def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Int, newValue: Int) {
    	support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)
    }

    def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Object, newValue: Object) {
    	support.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)
    }

    def firePropertyChange(evt: PropertyChangeEvent) {
    	support.firePropertyChange(evt)
    }

	def	firePropertyChange(propertyName: String, oldValue: Boolean, newValue: Boolean) {
		support.firePropertyChange(propertyName, oldValue, newValue)
	}

	def	firePropertyChange(propertyName: String, oldValue: Int, newValue: Int) {
		support.firePropertyChange(propertyName, oldValue, newValue)
	}

	def	firePropertyChange(propertyName: String, oldValue: Object, newValue: Object) {
		support.firePropertyChange(propertyName, oldValue, newValue)
	}

	def getPropertyChangeListeners(): Array[PropertyChangeListener] = support.getPropertyChangeListeners()
	def getPropertyChangeListeners(propertyName: String): Array[PropertyChangeListener] = support.getPropertyChangeListeners(propertyName)

	def hasListeners(propertyName: String): Boolean = support.hasListeners(propertyName)

 	def removePropertyChangeListener(listener: PropertyChangeListener) = support.removePropertyChangeListener(listener)
 	def	removePropertyChangeListener(propertyName: String, listener: PropertyChangeListener) = support.removePropertyChangeListener(listener)
}

class BeansPoint(x: Int, y: Int, listener: () => ()) extends java.awt.Point(x, y) with PropertyChangeSupportLike {
	def this() = this(0, 0)
}

val x = new BeansPoint()





