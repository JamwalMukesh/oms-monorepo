export interface CreateOrderRequest {
  productName: string;
  quantity: number;
  price: number;
}

export interface Order {
  id: number;
  productName: string;
  quantity: number;
  price: number;
  status: string;
}