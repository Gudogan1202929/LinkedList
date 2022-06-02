package application;

public class SNode<T extends Comparable<T>> {

	private SNode<T> next;
	private SNode<T> prev;
	@Override
	public String toString() {
		return "SNode [next=" + next + ", prev=" + prev + ", data=" + data + "]";
	}

	private T data;

	public SNode(T data) {
		super();
		this.data = data;
	}

	public SNode<T> getNext() {
		return next;
	}

	public void setNext(SNode<T> next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public SNode<T> getPrev() {
		return prev;
	}

	public void setPrev(SNode<T> prev) {
		this.prev = prev;
	}

}
