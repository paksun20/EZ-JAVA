[�������̽�]

�������̽�(interface)

1. ��ü�� ��� ����� ������ Ÿ��
2. ��ü�� ��ȯ���� ���� �ֱ� ���� ����
3. ��ü�� ��ü ������ ����ϴ� ���� ����
4. �Լ��� ��(�ñ״�ó)�� ���� 
5. ����� ���� ���� Ŭ������ ���ؼ��� ��ü�� ���� �� �ִ�.
6. Ŭ������ �԰�ȭ(���ȭ, ������Ʈȭ)

(���ÿ��)
1. IDL(Interface Definition Language)
2. API(Application Programming Interface)
3. Static Library
4. Dynamic Link Library(DLL)
5. Shared Library(SO)
6. RMI(Java Remote Method Invocation) vs COM 
7. COM(Component Object Model)
8. DCOM(Distributed Component Object Model)


(Java)
interface name {
	type constant = value;					// ����ʵ�
	type method(parameter, ...);			// �߻� �޼ҵ�
	
	// �ڹٿ� Ưȭ�� ���
	default type method(parameter, ...) { ... }	// ����Ʈ �޼ҵ�
	static type method(parameter, ...) { ... }	// ���� �޼ҵ�
}

(C++)
interface IUnknown {
	virtual HRESULT QueryInterface(REFIID riid, void **ppvObject) = 0;
	virtual ULONG AddRef() = 0;
	virtual ULONG Release() = 0;
};


