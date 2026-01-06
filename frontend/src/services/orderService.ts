import {httpClient} from "./httpClient";
import { type CreateOrderRequest, type Order } from "./order.types";

export const createOrder = async (
  request: CreateOrderRequest
): Promise<Order> => {
  const response = await httpClient.post<Order>(
    "/api/orders",
    request
  );
  return response.data;
};